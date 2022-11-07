from flask import Flask,render_template
app = Flask(__name__,template_folder='template')
@app.route('/')
def index():
    puppies = ['Fluffy','Blacky','Tommy']
    return render_template('template_control.html',puppies=puppies)
if __name__== '__main__':
    app.run(port=4000,debug=True)
