

# WEBCRAWLER ![Maven Central](https://img.shields.io/maven-central/v/io.github.tquality/webcrawler.svg)

Webcrawler is an easy to use package to add to your Selenium based Java tests. This package contains classes to click/input/Getdata from a webpage without the need of creating an own framework to wait or get the elements.
The framework contains 4 main package with their own specification:
* BrowserAction
* DataHarvest
* DataSend
* Waiting

## BrowserAction
BrowserAction is the package containing every moved of a webpage. In the current release this contains clicking methods and selecting values in a dropdown element.

## DataHarvest
DataHarvest is the package that will get information from a webpage. In the current release you can get text from a Webelement or get the Webelement itself.

## DataSend
DataSend is the package for sending information to the webpage. For example if you want to type a text inside an input element.

## Waiting
Waiting is the package that contains different classes to wait for element or for the webpage to load. 

