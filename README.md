# [KT Enterprise](https://enterprise.kt.com/main.jsp) 웹 사이트 개선 프로젝트
## Categorization 기반 맞춤형 상품 검색 기능 개발
KT 22-3 신입사원 루키캠프 프론트엔드 교육 프로젝트

## 프로젝트 소개
어쩌구저저구 - 피피티 완료되면 가져오기<br>
### <b> Architecture </b>

<img src="https://user-images.githubusercontent.com/58249219/194001801-eec5b10b-13d8-4041-bf37-b32b9f80af24.PNG" width=600 height=500>

## Demo
### <b> 흐름도 </b>

![흐름도](https://user-images.githubusercontent.com/58249219/194000944-93a1882a-c511-4e8d-a0d3-bd629ffbf4f1.PNG)

### <b> 페이지 상세 화면 </b>
- KT Enterprise 메인 페이지에서 맞춤형 상품 검색을 위해 모달창의 '찾기' 버튼 클릭

![캡처1](https://user-images.githubusercontent.com/58249219/194000124-a007d940-92f4-4d92-b158-36639a67bc6b.PNG)

- 맞춤형 서비스 탐색을 위한 사전 설문조사 진행

![캡처2](https://user-images.githubusercontent.com/58249219/194000845-b8015e07-853d-4ac0-98db-0a749bde8db6.PNG)

- 설문조사 결과 기반 맞춤형 서비스 추천 리스트
- 각 상품 클릭 시 상세 페이지로 이동

![캡처3](https://user-images.githubusercontent.com/58249219/194000928-a192ac36-44ac-4444-bcb9-c43f6cc7ff54.PNG)

- 상품 상세 페이지 
- 왼쪽 ‘맞춤 서비스’ 배너를 통해 다른 맞춤 서비스 상세 페이지로 바로 이동 가능 
- 오른쪽 만족도 조사를 통해 서비스 개선사항 수집

![캡처4](https://user-images.githubusercontent.com/58249219/194000937-44e4e798-d469-4f19-a781-383b05270d37.PNG)


### <b> 시연영상 추가하기~~ </b>

## Skills
![HTML Badge](https://img.shields.io/badge/HTML-E34F26?style=flat&logo=HTML5&logoColor=white)
![Java Badge](https://img.shields.io/badge/CSS-1572B6?style=flat&logo=CSS3&logoColor=white)
![Java Badge](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=JavaScript&logoColor=black)
![Java Badge](https://img.shields.io/badge/jQuery-0769AD?style=flat&logo=jQuery&logoColor=white)
<br>
[![H2 database Badge](https://img.shields.io/badge/H2_database-4479A1?style=flat-square&logo=h2&logoColor=white)](https://h2.org/)
[![SpringBoot Badge](https://img.shields.io/badge/springboot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=white)](https://www.SpringBoot.org/)
[![Java Badge](https://img.shields.io/badge/java-%23ED8B00?style=flat-square&logo=java&logoColor=white)](https://java.org/)
[![MyBatis Badge](https://img.shields.io/badge/MyBatis-%23FF0000?style=flat-square&logo=MyBatis&logoColor=white)](https://mybatis.org/)
<br>
[![git Badge](https://img.shields.io/badge/git-F05032?style=flat-square&logo=git&logoColor=white)](https://git.com/)
[![github Badge](https://img.shields.io/badge/github-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/)
[![notion Badge](https://img.shields.io/badge/Notion-181717?style=flat-square&logo=Notion&logoColor=white)](https://www.notion.so/ko-kr)
[![jira Badge](https://img.shields.io/badge/Jira-%230A0FFF?style=flat-square&logo=Jira&logoColor=white)](https://www.atlassian.com)




## Usage
<b>1. 터미널에 아래 명령어 실행</b>
```
git clone https://github.com/Jeongeun-s-Kids/RookieCamp-Frontend-Project.git
```

<b>2. H2 Database 로그인 <br></b>
- 드라이버 클래스: org.h2.Driver
- JDBC URL: jdbc:h2:tcp://localhost/~/test
- 사용자명: sa

<b>3. DemoApplication.java 실행 </b> <br>
- 파일 경로: RookieCamp-Frontend-Project/demo/src/main/java/com/example/demo/DemoApplication.java

<b>4. 크롬에서 아래 링크 접속 <br></b>
- http://localhost:9999/enterprise.kt.com/main.jsp.html



## Contributor

|기수|이름|
|:-----:|:-----:|
|[박정은](https://github.com/PJungeun)|디자인 및 프론트
|[박한나](https://github.com/hanna56)|프론트
|[송현진](https://github.com/ssonghj)|백엔드
|[정형섭](https://github.com/bluesky0960)|프론트
|[천명철](https://github.com/cmc9595)|백엔드, PM


## Project Directory
```shell
RookieCamp-Frontend-Project
└──                                
    ├── demo/src/main/  
    |    ├── resources
    │    │    ├── mybatis-mapper             # MyBatis로 H2 DataBase와 Spring Boot 연결
    │    │    └──  static                    # Frontend 파일
    │    │          ├── enterprise.kt.com    
    │    │          │   └── main.jsp.html    # KT Enterprise 메인 화면 사이트
    │    │          │
    │    │          └── front
    │    │              └── survey_1
    │    │                  └── survey.html  # 맞춤형 상품 검색 survey 창
    │    │
    │    └── java/com/example/demo
    │        │── DemoApplication.java
    │        │── controller                  # API 구현
    │        └── model
    │             ├── dao                    # DB와 연동
    │             ├── service                # 추상화 후 구현
    │             └── vo                     # 객체
    │    
    │ 
    ├── docs                                 # 프로젝트 관련 자료 (이미지 등)
    │ 
    └── project_sql.txt                      # SQL 파일
      
```
