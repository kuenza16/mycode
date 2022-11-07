
from flask import Flask
app = Flask(__name__)

@app.route('/')
def index():
    return '<h1>Hello world!</h1>'

@app.route('/information')
def info():
    return'<h1>Gyelpozhing</h1>'

@app.route('/department/<name>')
def department(name):
    return "<h1>This is a {} department</h1>".format(name.upper())
if __name__== '__main__':

    app.run()
    