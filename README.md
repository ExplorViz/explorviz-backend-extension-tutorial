# ExplorViz Backend Dummy Extension

This repository holds a dummy extension for [ExplorViz Backend](https://github.com/ExplorViz/explorviz-backend). Use it as a starting point for your future extension.

## Setup Development / Usage
1. Clone this repository (e.g. for SSH `git clone git@github.com:ExplorViz/explorviz-backend-extension-dummy.git`)
2. Set remote URL to the URL of your assigned repository (e.g. for SSH `git remote set-url origin git@github.com:ExplorViz/explorviz-backend-extension-X.git`)
3. Rename the root folder *explorviz-backend-extension-dummy* to *explorviz-backend-extension-X*, where X is the name of your extension
4. Run `./gradlew renameProject -PextensionName="X"`, where X is the name of your extension
4. Adjust the README.md (e.g. remove Setup sections)
5. Stage and commit changes with `git commit -am "renaming dummy"`
6. Push to remote origin and set upstream with `git push -u origin master`
7. Follow the [Backend Setup](https://github.com/ExplorViz/explorviz-backend#explorviz-backend)
8. In Eclipse: `Import -> Gradle -> Existing Gradle Project`
9. Start your development
10. Start the embedded web server with Gradle task `gretty -> appStart`
