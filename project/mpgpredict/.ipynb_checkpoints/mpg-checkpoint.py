from flask import Flask, jsonify
from flask import request
from flask_cors import CORS
import pandas as pd
import seaborn as sns
import joblib
import sklearn.externals
from PIL import Image
import dataframe_image as dfi
app=Flask(__name__)
CORS(app)


@app.route('/12')
def index1(a,b):
    #from PIL import Image
    #import dataframe_image as dfi
    #csv파일을 읽어들인다음 dif를통해 데이터를 이미지로 변환 후 저장
    train=pd.read_csv('data/data.csv')
    dfi.export(train.loc[train[10:20:]],'image/image.png')
    return 'e'

@app.route('/')
def index2():
    
    return 'aae'


if __name__=='__main__':
    
    app.run(debug=True)
