package com.iodesystems.starter.web.filters;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.webapp.contentfilter.BasicSelector;

public class SiteMeshFilter extends org.sitemesh.config.ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.setCustomSelector(new BasicSelector(true, "text/html", "application/xhtml+xml", "application/vnd.wap.xhtml+xml"));
    }
}
