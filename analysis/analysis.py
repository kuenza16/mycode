from select import select
import warnings
warnings.filterwarnings('ignore')
from bokeh.io import output_file, show
from bokeh.io import curdoc
from bokeh.plotting import figure
import pandas as pd
from bokeh.models.tools import ResetTool, PanTool, HoverTool
from bokeh.models import ColumnDataSource
from bokeh.models.annotations import LabelSet, Label
from bokeh.models.widgets import Select
from bokeh.layouts import layout


# output_file("students.html")

source = ColumnDataSource(dict(average_grades = ["B+","A","D-"],
                              exam_grades = ["A+","C","D"],
                              student_names = ["Karma","Namgay","Pema"]))

f = figure(x_range=["F","D-","D","D+","C-","C","C+","B-","B","B+","A-","A","A+"],
          y_range=["F","D-","D","D+","C-","C","C+","B-","B","B+","A-","A","A+"])

#description = Label(x=7,y=1,text="Grade for 3 students", render_mode="css")
#f.add_layout(description)

labels = LabelSet(x="average_grades",y="exam_grades", text="student_names",x_offset=5,y_offset=5,source=source)
f.add_layout(labels)

f.circle(x="average_grades",y="exam_grades",source=source,size=8)

#Create function
def update_labels(attr,old,new):
    labels.text=select.value
#create select widget
options=[("average_grades","Average Grades"),
("exam_grades","Exam Grades"),("student_names","Student Names")]
select=Select(title="Attribute", options=options)
select.on_change("value",update_labels)

# creat layout and add to curdoc
lay_out=layout([[select]])
curdoc().add_root(f)
curdoc().add_root(lay_out)