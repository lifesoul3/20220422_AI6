from flask import Flask, jsonify
from flask import request
from flask_cors import CORS
import pandas as pd
import sklearn.externals
import joblib

app=Flask(__name__)
CORS(app)

@app.route('/')
def index():
    return "Hello World"

@app.route('/predict', methods=['POST'])
def predict():
    feature_dict = request.get_json()
    X = pd.DataFrame.from_dict(feature_dict)
    prediction = clf.predict(X)
    print(prediction)
    return jsonify({'prediction': round(float(prediction),1)})

if __name__=='__main__':
    clf = joblib.load('BikeModel.pkl')
    app.run(debug=True)