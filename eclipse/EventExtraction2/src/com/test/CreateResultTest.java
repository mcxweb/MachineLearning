package com.test;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import com.tools.FileUtils;

/**
 * Created by feng on 2016/9/12.
 */
public class CreateResultTest {
    @Test
    public void resultFactory() throws Exception {

		String path=FileUtils.corpousPath+"/seq/test-seq.txt";
    	
        //String path="C:\\Users\\chenbin\\Desktop\\projects-master\\SSH-SVM1.1\\src\\main\\resource\\seq\\test-seq.txt";
        //String path = this.getClass().getClassLoader().getResource("seq/test-seq.txt").getPath();
        File file = new File(path);
        Assert.assertTrue(null!=file && file.exists());
        CreateResult.resultFactory(file);
    }

}