package com.rug.eaisystemmanagement.domainmodel;

import org.apache.commons.lang3.Validate;

public class Body {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        Validate.notBlank(content, "content is blank");
        this.content = content;
    }
}
