package com.jpdev.filter;

import javax.servlet.*;
import java.io.IOException;

public class InternalI18nFilter implements Filter {

    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {

        request.setAttribute("i18n_lang", "pt_BR");
        chain.doFilter(request, response);
    }


    public void destroy() {

    }

    public void init(final FilterConfig filterConfig) throws ServletException {

    }
}
