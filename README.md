# spring-learning

1 spring-boot-security-jsp 前后端集成项目，前端使用JSP，并且采用传统的xml配置方式来进行配置

2 spring-boot-security-sso-parent 是实现一个分布式项目的父工程
  2.1 spring-boot-security-common 是一个工具类工程，主要包含JWT(JSON WEB TOKEN)和RSA的使用
  2.2 spring-boot-auth-server 是一个认证服务，这个服务通过认证后，生成token给资源服务器使用
  2.3 spring-boot-source-product 资源服务器，通过认证服务生成的token，解析正确后就可以访问所需资源了
  
3 spring-boot-security-oauth 实现oauth2的父工程
  3.1 spring-boot-security-server 认证服务
  3.2 spring-boot-security-source 资源服务
