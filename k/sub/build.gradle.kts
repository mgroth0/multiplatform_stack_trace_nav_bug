	  
	  
	  
	  
	  
	  plugins { 
application
kotlin("jvm")
id("org.openjfx.javafxplugin") version "0.0.13"
}
application { 
mainClass.set("matt.sub.SubMainKt")
  /*https://stackoverflow.com/questions/59625091/javafx-module-does-not-export-to-unnamed-module*/
 applicationDefaultJvmArgs = listOf(
"--add-exports=javafx.graphics/com.sun.javafx.iio=ALL-UNNAMED",
"--add-exports=javafx.graphics/com.sun.javafx.iio.common=ALL-UNNAMED",
"--add-exports=javafx.graphics/com.sun.javafx.scene=ALL-UNNAMED",
"--add-exports=javafx.graphics/com.sun.glass.ui=ALL-UNNAMED",
 )
}
repositories { 
mavenCentral()
}
javafx {
  version = "19"
  modules = listOf("javafx.controls")
}
