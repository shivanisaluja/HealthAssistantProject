@Echo OFF
cd /d %~dp0
javac -cp classes\ -d classes\ src\ncu\exceptions\*.java
javac -cp classes\ -d classes\ src\ncu\validations\*.java
javac -cp classes\ -d classes\ src\ncu\java\*.java
javac -cp classes\ -d classes\ src\ncu\main\*.java
