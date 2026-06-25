module com.udacity.catpoint.security {
    requires com.udacity.catpoint.image;
    requires com.google.gson;
    requires com.google.common;
    requires java.desktop;
    requires java.prefs;
    requires miglayout.swing;
    requires org.slf4j;
    opens com.udacity.catpoint.security.data to com.google.gson;
    exports com.udacity.catpoint.security.data;
    exports com.udacity.catpoint.security.service;
    exports com.udacity.catpoint.security.application;
}