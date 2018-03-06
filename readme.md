# InterNetX schema files 

The InterNetX schema files project, contains the xml schema files for communitation with the autodns API. 

## Getting Started

You can download the files and uses these within your client. If you want to write your on client with java you can use the internetx schema files jar as dependency


### Quick start

* clone the repository and use the schema files under `src/main/resources/xsd` folder.
* Add the plugin to your `pom.xml`:

```
<project ...>
	...
	<dependencies>
		...
		<dependency>
			<groupId>com.internetx</groupId>
			<artifactId>schmema-files</artifactId>
			<version>1.0.3</version>
		</dependency>
		...
	</dependencies>
	...
</project>
```


End with an example of getting some data out of the system or using it for a little demo

## [Documentation](https://help.internetx.com/) ##

Please refer to the [wiki](https://help.internetx.com/) for the full documentation.

## Built With

* [JAXB2 Maven Plugin](https://github.com/highsource/maven-jaxb2-plugin ) - The maven plugin for building java classes depending on schema files
* [Maven](https://maven.apache.org/) - Dependency Management


## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Thomas Proll** - *Initial work*


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


