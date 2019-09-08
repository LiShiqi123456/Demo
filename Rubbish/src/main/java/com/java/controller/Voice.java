package com.java.controller;

import netscape.javascript.JSObject;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedInputStream;
import java.io.InputStream;

@Controller
public class Voice {

//    public static final String APP_ID = "xxx";
//    public static final String API_KEY = "xxx";
//    public static final String SECRET_KEY = "xxx";
//
//    @RequestMapping(value = "speechRecognition", method = RequestMethod.POST)
//    @ResponseBody
//    public Object speechReco(HttpServletRequest request) {
//
//        MultipartFile file = ((MultipartHttpServletRequest) request).getFile("file");
//        try {
//            byte[] pcmBytes = mp3Convertpcm(file.getInputStream());
//            org.json.JSONObject resultJson = speechBdApi(pcmBytes);
//            System.out.println(resultJson.toString());
//            if (null != resultJson && resultJson.getInt("err_no") == 0) {
//                return resultJson.getJSONArray("result").get(0).toString().split("，")[0];
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return "";
//    }
//    public byte[] mp3Convertpcm(InputStream mp3Stream) throws Exception {
//        // 原MP3文件转AudioInputStream
//         BufferedInputStream zipTest=new BufferedInputStream(mp3Stream);
//         //重新包装一层，不然会报错。
//         AudioInputStream mp3audioStream = AudioSystem.getAudioInputStream(zipTest);
//         // 将AudioInputStream MP3文件 转换为PCM AudioInputStream
//        AudioInputStream pcmaudioStream = AudioSystem.getAudioInputStream(AudioFormat.Encoding.PCM_SIGNED,
//                mp3audioStream);
//        byte[] pcmBytes = IOUtils.toByteArray(pcmaudioStream);
//        pcmaudioStream.close();
//        mp3audioStream.close();
//        return pcmBytes;
//    }
//    public static org.json.JSONObject speechBdApi(byte[] pcmBytes) {
//        // 初始化一个AipSpeech
//        AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);
//        // 可选：设置网络连接参数
//        client.setConnectionTimeoutInMillis(2000);
//        client.setSocketTimeoutInMillis(60000);
//        // 调用接口
//        org.json.JSONObject res = client.asr(pcmBytes, "pcm", 16000, null);
//        return res;
//    }
}
