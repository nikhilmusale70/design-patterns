package com.scaler.lld.design.assignments.prototype;

public class Configuration implements ClonableObject{
    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize, String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    public Configuration(Configuration configuration) {
        configuration.themeColor = this.themeColor;
        configuration.autoSave = this.autoSave;
        configuration.language = this.language;
        configuration.darkMode = this.darkMode;
        configuration.fontSize = this.fontSize;
        configuration.fontFamily = this.fontFamily;
        configuration.type = this.type;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    @Override
    public Object cloneObject() {
        return new Configuration(this);
    }
}