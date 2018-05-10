

# Archetype for Desktop Testing Projects
An archetype has the purpose to create projects based on its definitions in the most possible easy way. Starting creating your project following these instructions bellow.

#### Installing the archetype
To generate projects using this archetype, you must install it before. After cloning this repository, inside its folder, type the command
```sh
    mvn install
```
#### Generating a project:
```
    mvn archetype:generate -DarchetypeCatalog=local
```
- Will be asked for a number that represents the archetype already installed (it may appear at the bottom of the console). After that, you have to insert the groupId, artifactId and version (respectively) of the project to be created.
#### Running the sample test:
Inside the project folder that you already created, the file **thucydides.properties** has some attributes that must be changed before running the test.

- Set the ***webdriver.provided.io.openbdt.driver.DesktopDriver.path*** to the winium driver binary location.
- Set the ***webdriver.provided.io.openbdt.driver.DesktopDriver.port*** to the port where winium driver will be listening on.
- Set the ***application.path*** to the location where the application to be tested is located
- Set the ***window.application.<STRATEGY>*** refers to the main window of the application to be tested. For each strategy supported (id, xpath, class_name) a value must be set.

- Set where serenity-bdd report will be saved changing the ***serenity.outputDirectory*** value to a folder location in your local file system (may not exist).

After setting the properties above, you can run the test already defined in the project. Inside the project folder type the command

```sh
    mvn verify
```
end the test should be started.