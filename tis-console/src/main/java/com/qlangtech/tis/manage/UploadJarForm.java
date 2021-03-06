/* 
 * The MIT License
 *
 * Copyright (c) 2018-2022, qinglangtech Ltd
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.qlangtech.tis.manage;

import java.io.File;

/* *
 * @author 百岁（baisui@qlangtech.com）
 * @date 2019年1月17日
 */
public class UploadJarForm {

    private File uploadfile;

    private File schema;

    private File config;

    private File spring;

    private File coreprop;

    private File datasource;

    public File getUploadfile() {
        return uploadfile;
    }

    public void setUploadfile(File uploadfile) {
        this.uploadfile = uploadfile;
    }

    public File getSchema() {
        return schema;
    }

    public void setSchema(File schema) {
        this.schema = schema;
    }

    public File getConfig() {
        return config;
    }

    public void setConfig(File config) {
        this.config = config;
    }

    public File getSpring() {
        return spring;
    }

    public void setSpring(File spring) {
        this.spring = spring;
    }

    public File getCoreprop() {
        return coreprop;
    }

    public void setCoreprop(File coreprop) {
        this.coreprop = coreprop;
    }

    public File getDatasource() {
        return datasource;
    }

    public void setDatasource(File datasource) {
        this.datasource = datasource;
    }
}
