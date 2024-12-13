## Appium Setup environment  

### Windows Requirements 

* Appium Desktop `1.8.2`
* Node `v8.12.0` or higher `node -v`
* npm `6.7.0` or higher `npm -v`
* Java `1.8.0_181` `java -version`
* Appium `1.10.0` or higher `appium -v`
* Android Studio `3.X` or higher 


## Node Js Installation**

Download NodeJs LTS version from (https://nodejs.org/es/) and install it,
 
 ```
Not a big deal just 
Netx >> Next>> Next>>
as a normal windows installer ;)
```

To verify the installation run the following command from the command line A.K.A CMD 

```
node -v
```

It will returns something like this(according with your version)


```
x.x.x
```

Then run the following command to install appium(a nodeJs version)

```
npm install -g appium
```

Finally install appium-doctor to troubleshoot the errors(we will run it at the end)

```
npm install -g appium-doctor
```

Files you'll put the code you wrote yesterday into
## Java Installation and configuration**

Download Java for windows from the following url and install it(same thing next>> next>> next>>)(https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)


Setup JAVA HOME and PATH Environments

Configure your Path environment with the following values, if you don't know how to configure please read this tutorial first(https://www.computerhope.com/issues/ch000549.htm)


```
JAVA_HOME = C:\Program Files\Java\jdk1.8.0_181 > Don't forget to configure your proper Path my friend!
PATH = C:\Program Files\Java\jdk1.8.0_181\bin > Don't forget to configure your proper Path my friend!
```

## Run following command to verify the installation**

```
java -version 
```

It will return the following result

```
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
```

## Android studio installation and variable configuration**

Download android from (https://developer.android.com/studio/) and install it 

```
Just Next Next 
At the end follow the instrutction to complete the SDK installation
Its takes several minutes to complete the installation, so be patient 
```

Configure your environment variables according with your path  

```
ANDROID_HOME = C:\Users\yourPath\AppData\Local\Android\Sdk 

PATH = add the following lines 

C:\Users\yourPath\AppData\Local\Android\Sdk\tools\bin
C:\Users\yourPath\AppData\Local\Android\Sdk\platform-tools
C:\Users\yourPath\AppData\Local\Android\Sdk\tools
```

Finally run **Appium-Doctor** from the cmd to verify that everything it's well configured   

```
appium-doctor
```

## You will see the following output, at least Diagnostic for necessary dependencies must be satisfied, otherwise is not going to work**

```
info AppiumDoctor Appium Doctor v.1.8.0
info AppiumDoctor ### Diagnostic for necessary dependencies starting ###
info AppiumDoctor  ✔ The Node.js binary was found at: C:\Program Files\nodejs\node.EXE
info AppiumDoctor  ✔ Node version is 8.12.0
info AppiumDoctor  ✔ ANDROID_HOME is set to: C:\Users\yourPath\AppData\Local\Android\Sdk
info AppiumDoctor  ✔ JAVA_HOME is set to: C:\Program Files\Java\jdk1.8.0_181
info AppiumDoctor  ✔ adb exists at: C:\Users\yourPath\AppData\Local\Android\Sdk\platform-tools\adb.exe
info AppiumDoctor  ✔ android exists at: C:\Users\yourPath\AppData\Local\Android\Sdk\tools\android.bat
info AppiumDoctor  ✔ emulator exists at: C:\Users\yourPath\AppData\Local\Android\Sdk\tools\emulator.exe
info AppiumDoctor  ✔ Bin directory of %JAVA_HOME% is set
info AppiumDoctor ### Diagnostic for necessary dependencies completed, no fix needed. ###
info AppiumDoctor
info AppiumDoctor ### Diagnostic for optional dependencies starting ###
WARN AppiumDoctor  ✖ opencv4nodejs cannot be found.
WARN AppiumDoctor  ✖ ffmpeg cannot be found
WARN AppiumDoctor  ✖ bundletool.jar cannot be found
info AppiumDoctor ### Diagnostic for optional dependencies completed, 3 fixes needed. ###
info AppiumDoctor
info AppiumDoctor ### Optional Manual Fixes ###
info AppiumDoctor The configuration can install optionally. Please do the following manually:
WARN AppiumDoctor  ➜ Why opencv4nodejs is needed and how to install it: https://github.com/appium/appium/blob/master/docs/en/writing-running-appium/image-comparison.md
WARN AppiumDoctor  ➜ ffmpeg is needed to record screen features. Please read https://www.ffmpeg.org/ to install it
WARN AppiumDoctor  ➜ bundletool.jar is used to handle Android App Bundle. Please read http://appium.io/docs/en/writing-running-appium/android/android-appbundle/ to install it
info AppiumDoctor
info AppiumDoctor ###
info AppiumDoctor
info AppiumDoctor Bye! Run appium-doctor again when all manual fixes have been applied!
info AppiumDoctor
```
Appium Desktop `1.8.2`

Download Appium Desktop (https://github.com/appium/appium-desktop/releases/tag/v1.8.2) and install it 

Adppium Desktop
* run appium as administrator
* Select "Start Server vx.x.x" you will see the following line

```
[Appium] Appium REST http interface listener started on 0.0.0.0:4723
```
* Click on the Lupa button 
* Select Desired Capabilities 
* On JSON Representation add the following lines, don't forget to adjust al values acording with your divice

```
{
  "platformName": "android",
  "platformVersion": "6.0.1",
  "deviceName": "Redmi Note 3",
  "noReset": true,
  "appPackage": "",
  "appActivity": "",
  "automationName": "uiautomator2"
}
```

* Select "Start Session" button in order to start an interaction with your device. 

* If a error appears read the logs to identify it 


### Linux Requirements  

## TBD

* Appium Desktop 1.8.2 

* Node v8.12.0 or higher ``` node -v ```
* npm 6.7.0 or higher ``` npm -v ```
* Java "1.8.0_181" ``` java -version ```
* Appium 1.10.0 or higher ``` appium -v ```
* Android Studio 3.X or higher 



## Node Js Installation**


    curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.0/install.sh | bash

Edit bashrc 
    
    code ~/.bashrc
    
    export NVM_DIR="$HOME/.nvm"
    [ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
    [ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion
    
    

Download latest nodejs linux binaries from (https://nodejs.org/download/release/latest/) into a folder for example /home/superman/Downloads (where superman is your username and you have downloaded the file in Downloads)

Now install it under `/usr/local`

```
cd /usr/local
tar --strip-components 1 -xzf /home/superman/Downloads/node-v8.2.1-linux-x64.tar.gz
```

Check the installation using

```
which node
```
it should give you an output

```
usr/local/bin/node
```

Check the version

```
node -v 
```
should give you output

```
v8.2.1 (or whichever version you have installed)
```

**Allow access to the following folders**



```
chmode 777

/usr/local/bin
/usr/local/lib
/usr/local/lib/node_modules
```

**Install appium**

```
npm install -g appium
```

**Install appium-doctor to troubleshoot the errors**

```
npm install -g appium-doctor
```

**Java Installation and configuration**

Download Java from the followin url (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Install it in the following path 

```
tar -xzf jdk-8u201-linux-x64.tar.gz
```

Create a folder under `/opt/java/` and move the untar file


```
mv /opt/java/jdk1.8.0_201/bin/java
```

**Set the JAVA HOME path**

Edit file  bashrc under user path `/home/userxxx/.bashrc`

```
gedit /home/userxxx/.bashrc
vim /home/userxxx/.bashrc
```

Add the following lines in your `.bashrc` file 

```
export JAVA_HOME=/opt/java/jdk1.8.0_201/          
export PATH=${PATH}:${JAVA_HOME}/bin
```

**run following command to verify the path**

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
Add the following lines into your `bashrc` file

```
export ANDROID_HOME=~/Android/Sdk/
export PATH=$PATH:~/Android/Sdk/tools
export PATH=$PATH:~/Android/Sdk/platform-tools
```


then 

```
appium-doctor
```

it will give checklist of which things are okay and which are not like this






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


### macOS Requirements  

**Node Js Installation**


Before to follow this procedure be sure that you don't have a NodeJs version already installed with the following command

```
node -v 
```

If this command returns any value please remove node NodeJs with the procedure below 

If you have a completly mess like Luisa use the following tutorial (https://stackabuse.com/how-to-uninstall-node-js-from-mac-osx/)


Install Homebrew https://brew.sh/index_es with the following command

```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

From the terminal run the following command 

    brew install nvm

Edit zshrc 
    
    code ~/.zshrc
    
    export NVM_DIR="$HOME/.nvm"
    [ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
    [ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion

Install Node 

    nvm install v22.11.0
    

Verify your installation

```
node -v 
```

**Install appium**

```
npm install -g appium
```

    ~ npm install -g appium
 
    npm error code UNABLE_TO_GET_ISSUER_CERT_LOCALLY
    npm error errno UNABLE_TO_GET_ISSUER_CERT_LOCALLY
    npm error request to https://registry.npmjs.org/appium failed, reason: unable to get local issuer certificate
 
    npm config set strict-ssl false



**Install appium-doctor to troubleshoot the errors**

```
npm install -g appium-doctor
```

**Android studio setup**

TBD


**Java Installation**


TBD



**Environment setup**

Appium service 

    brew install appium

To start appium now and restart at login:

    brew services start appium

Or, if you don't want/need a background service you can just run:
  
    /opt/homebrew/opt/appium/bin/appium

Appium Inspector

    brew install --cask appium-inspector

Edit file bash_profile `/Users/user/.bash_profile`

```
vi /Users/user/.bash_profile

```

Add the following lines in your `.bash_profile` file 

```
#### ANDROID_HOME #########

export ANDROID_HOME=/Users/admin/Library/Android/sdk
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME/tools:$PATH


      brew install openjdk
 
     sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk \
          /Library/Java/JavaVirtualMachines/openjdk.jdk


##### JAVA_HOME ########
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home
export PATH=${PATH}:${JAVA_HOME}/bin

```

**Run the following command to install Carthage**

```
brew install carthage
```

**Run the following command to verify the setup**

```
appium-doctor
```


**You will see the following output, at least the necessary dependencies must be satisfied, otherwise is not going to work**


```
info AppiumDoctor Appium Doctor v.1.9.0
info AppiumDoctor ### Diagnostic for necessary dependencies starting ###
info AppiumDoctor  ✔ The Node.js binary was found at: /usr/local/bin/node
info AppiumDoctor  ✔ Node version is 11.10.0
info AppiumDoctor  ✔ Xcode is installed at: /Applications/Xcode.app/Contents/Developer
info AppiumDoctor  ✔ Xcode Command Line Tools are installed in: /Applications/Xcode.app/Contents/Developer
info AppiumDoctor  ✔ DevToolsSecurity is enabled.
info AppiumDoctor  ✔ The Authorization DB is set up properly.
info AppiumDoctor  ✔ Carthage was found at: /usr/local/bin/carthage
info AppiumDoctor  ✔ HOME is set to: /Users/admin
info AppiumDoctor  ✔ ANDROID_HOME is set to: /Users/admin/Library/Android/sdk
info AppiumDoctor  ✔ JAVA_HOME is set to: /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home
info AppiumDoctor  ✔ adb exists at: /Users/admin/Library/Android/sdk/platform-tools/adb
info AppiumDoctor  ✔ android exists at: /Users/admin/Library/Android/sdk/tools/android
info AppiumDoctor  ✔ emulator exists at: /Users/admin/Library/Android/sdk/tools/emulator
info AppiumDoctor  ✔ Bin directory of $JAVA_HOME is set
info AppiumDoctor ### Diagnostic for necessary dependencies completed, no fix needed. ###
info AppiumDoctor 
info AppiumDoctor ### Diagnostic for optional dependencies starting ###
WARN AppiumDoctor  ✖ Python version required by node-gyp (used by heapdump) should be 2.x
WARN AppiumDoctor  ✖ opencv4nodejs cannot be found.
WARN AppiumDoctor  ✖ ffmpeg cannot be found
WARN AppiumDoctor  ✖ fbsimctl cannot be found
WARN AppiumDoctor  ✖ applesimutils cannot be found
WARN AppiumDoctor  ✖ idevicelocation cannot be found
WARN AppiumDoctor  ✖ ios-deploy cannot be found
WARN AppiumDoctor  ✖ ios_webkit_debug_proxy cannot be found
WARN AppiumDoctor  ✖ bundletool.jar cannot be found
info AppiumDoctor ### Diagnostic for optional dependencies completed, 9 fixes possible. ###
info AppiumDoctor 
info AppiumDoctor ### Optional Manual Fixes ###
info AppiumDoctor The configuration can install optionally. Please do the following manually:
WARN AppiumDoctor  ➜ Manually configure Python 2.x environment. node-gyp which is NodeJS toolchain requires Python 2.x
WARN AppiumDoctor  ➜ Why opencv4nodejs is needed and how to install it: https://github.com/appium/appium/blob/master/docs/en/writing-running-appium/image-comparison.md
WARN AppiumDoctor  ➜ ffmpeg is needed to record screen features. Please read https://www.ffmpeg.org/ to install it
WARN AppiumDoctor  ➜ Why fbsimctl is needed and how to install it: http://appium.io/docs/en/drivers/ios-xcuitest/
WARN AppiumDoctor  ➜ Why applesimutils is needed and how to install it: http://appium.io/docs/en/drivers/ios-xcuitest/
WARN AppiumDoctor  ➜ idevicelocation is used to set geolocation for real device. Please read https://github.com/JonGabilondoAngulo/idevicelocation to install it
WARN AppiumDoctor  ➜ ios-deploy is used to install iOS applications to real device. Please read http://appium.io/docs/en/drivers/ios-xcuitest-real-devices/ to install it
WARN AppiumDoctor  ➜ ios_webkit_debug_proxy is used to proxy requets from Appium to MobileSafari running on real device. Please read https://github.com/google/ios-webkit-debug-proxy to install it
WARN AppiumDoctor  ➜ bundletool.jar is used to handle Android App Bundle. Please read http://appium.io/docs/en/writing-running-appium/android/android-appbundle/ to install it
info AppiumDoctor 
info AppiumDoctor ###
info AppiumDoctor 
info AppiumDoctor Bye! Run appium-doctor again when all manual fixes have been applied!
info AppiumDoctor 
```


### Errors 

Could not find a driver for automationName 'XCUITest'


    [AppiumDriver@8764] Encountered internal error running command: Error: Could not find a driver for automationName 'XCUITest' and platformName 'iOS'. Have you installed a driver that supports   
    those capabilities? Run 'appium driver list --installed' to see. (Lower-level error: Could not find installed driver to support given caps)
    at DriverConfig.findMatchingDriver (/Users/a317926/.nvm/versions/node/v22.11.0/lib/node_modules/appium/lib/extension/driver-config.js:175:13)

```    
appium driver list --installed
```

```   
appium driver install xcuitest
appium driver install uiautomator2
```

### How to find capabilities Android 


1. If you have more than one device connected, you can use the `adb devices` command to list all connected devices. Here’s how to do it:

 ```
 adb devices
 ```

This command will show you a list of connected devices along with their identifiers. For example:

```
List of devices attached
emulator-5554   device
emulator-5556   device
```

2. Specify the device when running commands: When you have multiple devices connected, you need to specify which device you want to send commands to by using the `-s` option followed by the device identifier. For example, to get the Android version of a specific device, you can use:

```
adb -s emulator-5554 shell getprop ro.build.version.release
```

```
adb -s emulator-5554 shell getprop ro.product.model
```
