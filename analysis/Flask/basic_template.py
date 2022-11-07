from flask import Flask, render_template

app = Flask(__name__,template_folder='template')

@app.route('/')
def index():
    return render_template('basic.html')

if __name__ == "__main__":
     app.run(port=4000,debug=True)


   