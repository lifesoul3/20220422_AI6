from flask import Flask, jsonify
from flask import request
from flask_cors import CORS
import pandas as pd
import seaborn as sns
import joblib
import sklearn.externals
from PIL import Image
import dataframe_image as dfi
import matplotlib.pyplot as plt
import os

def loading():
    data=sns.load_dataset('mpg')
    data.loc[data['horsepower'].isna(),'horsepower']=data['horsepower'].mean()
    data.to_csv(os.path.join('data/','data.csv'),index=False)
    return data

data=loading()



app=Flask(__name__)
CORS(app)
@app.route('/')
def index1():    
    #from PIL import Image
    #import dataframe_image as dfi
    #csv파일을 읽어들인다음 dif를통해 데이터를 이미지로 변환 후 저장
    #train=pd.read_csv('data/data.csv')
    #dfi.export(train.loc[train[10:20:]],'image/image.png')
    return 'e'


@app.route('/<size>')
def index2(size):
    
    return ''

CORS(app)
@app.route('/data/<size>')
def index3(size):
    count=''
    tlist=[]
    for i in size:
        if i.isdigit():
            count+=i
        else:
            tlist.append(int(count))
            count=''
    dfi.export(data.loc[tlist[0]:tlist[1]],'mpgsvelte/src/image/image.png')
    return ''


@app.route('/columns')
def index4():
    columns=({})
    count=1
    for i in data.columns:
        columns[count]=i
        count+=1
    return jsonify(columns)

#,hue='origin'
CORS(app)
@app.route('/plot/<plot>_<X>_<Y>')
def index5(plot,X,Y):
    if plot=='count':
        k=sns.countplot(data=data,x=X)
        plt.savefig(fname='mpgsvelte/src/image/dataimage.png')
    return 'a'




if __name__=='__main__':
    loading()
    app.run(debug=True)
