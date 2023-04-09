# HUMANISE: Language-conditioned Human Motion Generation in 3D Scenes（2022 NeuralPS）

## Contribution

1.  一个HSI数据集
2. 一个task：给定language、3D scene点云，生成human motion

## HSI 数据集
### 1. 内容

### 2. 合成pipeline
Step 1：根据预先定义的物体类别，在场景中sample目标物体、目标物体上可能的交互点

Step 2：对motion sequence，通过collision、contact来sample合理的translation、orientation

Step 3：对transform后的motion sequence用模板语言描述来标注

### 3. Q&A
Q1. 怎么知道action对应的目标物体是什么？

A1. 目标物体的类别是预先定义的，然后根据类别确定目标物体

Q2. 怎么确定目标物体的位置，以及目标物体上可能的交互点？

A2. 

## Human motion generation
问题：给定language、3D scene点云，生成 T frame pose sequences

分析：
- language中包含action 类别、目标物体类别、目标物体的位置范围信息
- 生成motion需要的参数：global translation、global orientation、joint rotation
- 通过action类别、确定pose相关的参数joint rotation，通过目标物体类别、目标物体的位置范围信息确定locomotion相关参数translation、orientation，还需要目标物体的几何信息来改进joint，使得交互姿势更好

