from flask import Flask, render_template
app = Flask(__name__)

@app.route('/puppy/<name>')
def puppy_name(name):
    letters = list(name)
    pup_dict ={'pup_name':name}
    return render_template('template_variables.html',
    name=name,mylist=letters,mydict=pup_dict)

if __name__=="__main__":
    app.run(debug=True)