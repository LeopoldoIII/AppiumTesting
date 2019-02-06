# Setup enviroment Appium Java

### Requirements Windows


**Node Js Installation**

Download Node Js LTS version from (https://nodejs.org/es/) and install it `Netx >> Next>>`


**Install appium **

```
npm install -g appium
```

**Install appium-doctor to troubleshoot the errors if any using**

```
npm install -g appium-doctor
```

then 

```
appium-doctor
```


**Java Installation and configuration**

Download Java from the followin url (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)



**Set the JAVA HOME path Enviroments**



**Run following command to verify the installation**

```
java --version 
```

It will give you your current path 


**Download android studio**

Download android from https://developer.android.com/studio/ install it 

Just Next Next 
At the end follow the instrutction to complete the SDK instllation


**Set the ANDROID HOME path Enviroments**





### Requirements Linux 

**Node Js Installation**

Download latest nodejs linux binaries from (https://nodejs.org/download/release/latest/) into a folder for example /home/superman/Downloads (where superman is your username and you have downloaded the file in Downloads)

Now install it under `/usr/local`

```
cd /usr/local
tar --strip-components 1 -xzf /home/superman/Downloads/node-v8.2.1-linux-x64.tar.gz
```

**Check the installation using**

```
which node
```
**it should give you output**

```
usr/local/bin/node
```

**Check the version**

```
node -v 
```

**should give you output*


```
v8.2.1 (or whichever version you have installed)
```

**Allow acces to the following folders**

```
/usr/local/bin
/usr/local/lib
```

**Install appium**

```
npm install -g appium
```

**check if appium is installed using**


appium

**Install appium-doctor to troubleshoot the errors if any using**

```
npm install -g appium-doctor
```

**then **

```
appium-doctor
```

**it will give checklist of which things are okay and which are not like this**

```
info AppiumDoctor Appium Doctor v.1.8.0
info AppiumDoctor ### Diagnostic for necessary dependencies starting ###
info AppiumDoctor  ✔ The Node.js binary was found at: /usr/local/bin/node
info AppiumDoctor  ✔ Node version is 11.9.0
info AppiumDoctor  ✔ ANDROID_HOME is set to: /home/usuario/Android/Sdk
info AppiumDoctor  ✔ JAVA_HOME is set to: /opt/java/jdk1.8.0_201
info AppiumDoctor  ✔ adb exists at: /home/usuario/Android/Sdk/platform-tools/adb
info AppiumDoctor  ✔ android exists at: /home/usuario/Android/Sdk/tools/android
info AppiumDoctor  ✔ emulator exists at: /home/usuario/Android/Sdk/tools/emulator
info AppiumDoctor  ✔ Bin directory of $JAVA_HOME is set
info AppiumDoctor ### Diagnostic for necessary dependencies completed, no fix needed. ###
info AppiumDoctor 
info AppiumDoctor ### Diagnostic for optional dependencies starting ###
WARN AppiumDoctor  ✖ opencv4nodejs cannot be found.
info AppiumDoctor  ✔ ffmpeg is installed at: /usr/bin/ffmpeg. ffmpeg version 3.4.4-0ubuntu0.18.04.1 Copyright (c) 2000-2018 the FFmpeg developers
WARN AppiumDoctor  ✖ bundletool.jar cannot be found
info AppiumDoctor ### Diagnostic for optional dependencies completed, 2 fixes needed. ###
info AppiumDoctor 
info AppiumDoctor ### Optional Manual Fixes ###
info AppiumDoctor The configuration can install optionally. Please do the following manually:
WARN AppiumDoctor  ➜ Why opencv4nodejs is needed and how to install it: https://github.com/appium/appium/blob/master/docs/en/writing-running-appium/image-comparison.md
WARN AppiumDoctor  ➜ bundletool.jar is used to handle Android App Bundle. Please read http://appium.io/docs/en/writing-running-appium/android/android-appbundle/ to install it
info AppiumDoctor 
info AppiumDoctor ###
info AppiumDoctor 
info AppiumDoctor Bye! Run appium-doctor again when all manual fixes have been applied!
info AppiumDoctor 
```

**Java Installation and configuration**

Download Java from the followin url (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Install it in the following path 

```
tar -xzf dk-8u201-linux-x64.tar.gz

/opt/java/jdk1.8.0_201/bin/java
```

**Set the JAVA HOME path**

Edit file  bashrc under user path `/home/userxxx/.bashrc`

```
gedit /home/userxxx/.bashrc
vim /home/userxxx/.bashrc
```

**Add the following lines in your `.bashrc` file **

```
export JAVA_HOME=/opt/java/jdk1.8.0_201/bin/java          
export PATH=${PATH}:${JAVA_HOME}/bin
```

**Run following command to verify the path**

```
echo $JAVA_HOME
echo $PATH
which java
```

**Download android studio**

Just Next Next 

**Set the ANDROID HOME path**

Edit file  bashrc under user path `/home/userxxx/.bashrc`

```
gedit /home/userxxx/.bashrc
vim /home/userxxx/.bashrc
```

**Add the following lines into your `bashrc` file**

```
export ANDROID_HOME=/home/user_name/Android/Sdk
export PATH=$PATH:/home/user_name/Android/Sdk/tools
export PATH=$PATH:/home/user_name/Android/Sdk/platform-tools
```
