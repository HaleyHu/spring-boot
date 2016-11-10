
# Configure HTTPS in spring-boot application

```
$ keytool -genkeypair -keyalg RSA -alias tomcat -dname "CN=Haley, OU=Dev, O=test, L=BJ, ST=BJ, C=CN" -keystore test.keystore -storepass 123456 -validity 3650 -keysize 2048
输入 <tomcat> 的密钥口令
	(如果和密钥库口令相同, 按回车):  
$ ls
test.keystore
```

