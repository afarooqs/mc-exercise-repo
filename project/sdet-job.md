# Software Developer Engineer in Test Role at Ernst & Young

Testing at EY is mostly automated with very little manual testing. This requires the person responsible to be intimately aware of application and infrastructure architecture that is being implemented by EY's team.

Our focus is to provide more back end test coverage (compared to front end) by testing APIs and services.

Front end testing coverage is basic compared to back end because most features are thoroughly tested at the API level.

## Required Skills

#### Tools, Frameworks & Languages
* Back End test frameworks
* BrowserStack/SauceLabs
* Contract Testing
* Front End test frameworks
* Functional Testing
* Gatling
* Git
* Gradle
* Groovy
* Java 8+
* Javascript
* Jenkins/Travis CI/Bamboo
* JMeter
* JUnit
* Load Testing
* PACT (Contract) Testing
* Performance Testing
* Postman
* Redis
* Rest Assured
* RESTful API testing
* Selenium
* Shell Scripting
* TestNG

## Areas of Testing

#### Front End
Front End testing is being done through a combination of local Selenium Grid and cloud Browserstack environments. For this, following tools and frameworks are used:

* Java `Selenium` `WebDriver` implementation.
* Mobile Testing with `Appium`.
* Parallel testing through `Browserstack` reduces time to execute and also enables video playback of test runs.
* `Javascript`.
* `CSS` & `Xpath`.
* Debugging in `Chrome` Developer mode.
* `Protractor` for `Angular` based apps.
* `Jasmine` & `Karma` for BDD tests.

#### Back End
Platform architecture at EY projects involves building:

* Microservices.
* Common Libraries.
* Deploying to a cloud environment.

To provide sufficient test coverage the team performs the following types of testing:

1. Unit: `Java` `Spring Boot`.
2. Integration: `Spock`/`Groovy`.
3. Functional: `Java`, `Wiremocks`.
4. Contract/Pact: `Java`, `Pact`, `JSON`.
5. Basic REST smoke testing: `Postman`, `Javascript`.

#### Performance
Performance and Load testing of these microservices is done through two tools targeting towards an isolated environment specifically for performance testing.

1. JMeter
2. Gatling

Scenarios need to be identified first to target specific load testing scenarios with specific user load strategies (such as constant, ramp up, ramp down, etc.).

#### Infrastructure
Services can be deployed to different cloud platforms such as PCF (Pivotal Cloud Foundary). Deployments are done through Jenkins.

* Understanding of `Groovy` scripting language is essential in debugging and deployment issues in CI environment.
* `PCF` cloud infrastructure setup knowledge is also essential.
* `AWS`, `Azure` and `GCP` platform knowledge is also useful.
* Using monitoring tools is necessary to track application behavior. For this we use: `Cloud Watch`, `Dynatrace`, `New Relic`, `Splunk`, etc.

#### Understanding of Java Spring Boot
Microservices are developed in Spring Boot on Java 8. Clear and thorough understanding of this framework helps in formulating a coherent test strategy.

For this reason the SDET needs to get familiar with Spring annotations and conventions to test microservices being developed.

## Daily Activities
1. Participate in Story Elaboration meetings with Product Owner, Project Manager and Developers:
    * to clearly understand features being developed.
    * ask questions about scope.
    * bring up any testing issues & concerns.
    * clarify Quality concerns from an end user perspective and recommend changes to features.
2. Participate in daily team Standups:
    * Report progress on assigned tasks.
    * Bring up any blocking issues.
    * Ask questions on anything that's not clear.
3. Develop test cases for REST services from a client perspective.
4. Basic REST endpoint testing through `Postman`.
    * Establish understanding of requests/responses.
    * Write tests in Postman.
    * Share Postman test collection with other team members.
5. Develop comprehensive Integration automated test suite using Groovy/Spock test framework:
    * Positive test cases.
    * Negative test cases.
    * Implement exhaustive test case combinations/permutations.
    * Create detailed test data set for above.
6. Create contract tests between Microservices:
    * Write tests in Provider service.
    * Write tests in Consumer service(s).
    * Write tests using `PACT` library and `JSON`.
7. All code written by SDET follow the same coding standards as Developers.
    * Understand best coding practices with the team.
    * Follow the repository forking strategy as the rest of the team.
    * Commit and merge code through Pull Requests.
    * Participate in Code Reviews through Pull Requests in Bit Bucket.
8. Deep understanding of application being developed:
    * Learn the implementation of generating code through Swagger.
    * Model-Controller (and view if applicable) implementation.
9. Setup Development environment on SDET's local machine.
    * Must be able to setup and run service locally.
    * Understand dependencies on other libraries and services.
    * Debugging application through logs.
    * Querying the data source directly (e.g. `Redis`).
10. Understanding deployment in CI environment:
    * Various stages of build (e.g. `checkstyle`, `findBugs`, etc.).
    * Pipeline stages.
    * Debugging issues in Jenkins through published logs.
11. Collaborate with Developers to establish better understanding of code being implemented and help them write better tests.
12. Suggest better test practices to other teams within EY:
    * By showing proof of concepts on new/different tools which can increase test efficiencies: (e.g. Gatling).
    * More test coverage by data driver testing.
    * Follow clear and well established naming conventions in test code.
    * Suggest new Design Patterns within test code.
13. Create Staging & Test environment Bootstrap strategy:
    * Create data dump from production.
    * Sanitize data.
    * Apply new schema.
    * Database refresh.
    * Restore database(s).
    * Stop services running in target environment.
    * Deploy new versions of services.
    * Restart services in correct order.
    * Run sanity tests to ensure target environment is properly behaving.
