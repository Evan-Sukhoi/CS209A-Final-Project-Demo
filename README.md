# 🫧CS209A-Final-Project-Demo
![CourseInfo](https://img.shields.io/badge/sustech--cs209a-23fa%3Aproject--demo-brightgreen)[![License](https://img.shields.io/github/license/hezean/chatting)](https://github.com/Evan-Sukhoi/CS209A-Final-Project-Demo/blob/master/LICENSE)

This is SUSTech CS209A 2023 Fall course final project demo for students, including a StackOverflow data analysis and visualization web page based on SpringBoot and HTML.

## Preface

This is just a sample demo with a small amount of data and trivial visualization, and you need to **collect and analyse data** according to the document and **design a more beautiful view** by yourself. This demo is to help you to understand the main structure of the code and provide quick start, and you can also redesign it without using this demo.

🔔***Kindly note that this demo uses static data stored in tagCount_demo.js directly within the front-end, which will result in 20 points deductions during evaluation. Hence, it is recommended that the data analysis process be conducted by the server in response to requests from the front-end.***

- The data in this demo is from 50 Java threads in StackOverflow, which are the top 50 ones with the most activity collected on Nov. 19, 2023. 
- The demo is a SpringBoot project with Maven as the package manager, using SpringBoot version 3.1.5, and the default JDK version is 20. The thymeleaf template engine ([see the documentation for more details](https://www.thymeleaf.org/)) is imported through Maven for page rendering. 
- The frontend and backend of this demo are not separated (you can also create a separate front-end and back-end  project), and the frontend uses HTML, CSS, and Javascript (you can use  Vue, React, or any other front-end frameworks). The echarts framework for wordcloud and barchart is imported via jsdelivr CDN ([see the documentation of ECharts](https://echarts.apache.org/handbook/en/get-started/)).
- The `data.json` file is an original json file returned from the Stack Exchange API, for reference only. You can specify the returned content by modifying the request url according to [API document](https://api.stackexchange.com/docs). You are highly encouraged to explore the `try it` tool (as shown below) embedded within this document before start.
  ![](https://cdn.jsdelivr.net/gh/Evan-Sukhoi/ImageHost@main/img/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202023-12-12%20145546.png)

## Quick Start

#### 1. Create your own repository

If you want to use this demo as the beginning of your final project, Click the [use template](https://github.com/new?template_name=CS209A-Final-Project-Demo&template_owner=Evan-Sukhoi) to create a fork of this template - to avoid potential plagiarism disputes, **please be sure that your repository is made *private* before the deadline**. But it is recommend you start from **create a new project** and copy the `src` folder and `pom.xml` to your hierarchy (it will help you get more familiar with SpringBoot).

#### 2. Load the demo to your computer

Clone your repository to your local machine. You can then open the whole folder as a project in your IDE -  it will recognize the SpringBoot Application structure and automatically configure the project. If you see the hierarchy below, it means success.

![image-20231121150559235494d8dad569e65c4.png](https://img.picgo.net/2023/11/21/image-20231121150559235494d8dad569e65c4.png)


If it failed to be recognized  automatically, you can find the `pom.xml` file in IDEA and right click it, and then click `Add as Maven Project`. After indexing, you will see the result above.

![image-202311211517397082e31c2e6a09995ba.png](https://img.picgo.net/2023/11/21/image-202311211517397082e31c2e6a09995ba.png)

#### 3. Run the Demo

##### Using IDEA

Find `Java2FinalProjectDemoApplication.java` in **src -> main -> java -> edu -> sustech -> cs209a -> java2finalprojectdemo** and run it.

If you see the result below, congratulations!🎉

![image-20231121161122134bbba8ed285b69142.png](https://img.picgo.net/2023/11/21/image-20231121161122134bbba8ed285b69142.png)

##### Using Terminal

First, make sure you have installed maven. If not, please visit this [link](https://maven.apache.org/download.cgi#) to download and remember to add the `/bin` folder to the Environment Variables (for Windows users).

Then, use the command below to package and install the project into your local Maven repository.

```
mvn install
```

And run the application with command

```
mvn spring-boot:run
```

If you see the result below, congratulations!🎉

![image-20231121165151504ce3aa85a94bb0b1f.png](https://img.picgo.net/2023/11/21/image-20231121165151504ce3aa85a94bb0b1f.png)

## How to see the result

After running the project, you can visit [localhost:8090](localhost:8090) (based on your port number) to see the demo result.

![image-2023112116582944270af2552dfde37f7.png](https://img.picgo.net/2023/11/21/image-2023112116582944270af2552dfde37f7.png)

## Problems

You can change the port number `8090` in `application.properties` if occurs port conflict.

If you have any other questions, please ask in [issues](https://github.com/Evan-Sukhoi/CS209A-Final-Project-Demo/issues).
