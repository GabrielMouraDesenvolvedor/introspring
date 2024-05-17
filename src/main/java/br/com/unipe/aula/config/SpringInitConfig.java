package br.com.unipe.aula.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return new Class[] { RootConfig.class };
=======
		return new Class[] {RootConfig.class};
>>>>>>> e825eaa (firt commit)
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return new Class[] { SpringMvcConfig.class };
=======
		return new Class[] {SpringMvcConfig.class};
>>>>>>> e825eaa (firt commit)
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return new String[] { "/" };
	}

}
=======
		return new String[] {"/"};
	}
    
}

>>>>>>> e825eaa (firt commit)
