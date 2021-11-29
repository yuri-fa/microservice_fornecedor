package br.com.yuri.fornecedor.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfigure extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		//retringindo o acesso aos serviços que apenas usuarios autenticados podem acessar
		http.authorizeRequests()
		.antMatchers(HttpMethod.POST, "/pedido")
		.hasRole("USER");
	}

	
}
