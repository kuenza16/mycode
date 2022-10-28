from select import select
from turtle import update
from numpy import average, cumproduct
from bokeh.layout import layout
from bokeh.io import curdoc


# create columndatasource
# create figure

def update_labels(attr,old,new):
    labels,text = select.value

option = [("average_grades","Average Grades"),("exam_grades","Exam Grades"),("student_names","Student Names")]
select = select(title="Attributes",option = option)
select.on_change('values',update_labels)

# creating layout and add to curdoc

lay_out = layout([[select]])
curdoc().add_root(f)
curdoc().add_root(lay_out)