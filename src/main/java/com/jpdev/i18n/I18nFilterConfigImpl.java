package com.jpdev.i18n;

import i18n.filter.config.I18nFilterConfig;
import i18n.translations.language.Language;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class I18nFilterConfigImpl extends I18nFilterConfig {

    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        saveSession(((HttpServletRequest) request).getSession());
        saveLanguage(Language.PT_BR);
        chain.doFilter(request, response);
    }

}
