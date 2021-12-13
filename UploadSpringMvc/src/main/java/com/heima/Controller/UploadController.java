package com.heima.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
@Controller
public class UploadController {
    @RequestMapping("/Upload")
    public String  Upload(HttpServletRequest request, MultipartFile uploadfile, String desc) throws Exception{
        System.out.println("desc="+desc);
        // 获取上传的文件名
        String originalFilename = uploadfile.getOriginalFilename();
        // 设置本地的保存图片的路径
        String dirname = request.getSession().getServletContext().getRealPath("/Upload");
        //生成完整的路径：因为运行后的文件是在target,在项目的目录下是不会显示保存的文件图片的，只能在target文件下的路径才能看到文件图片
        String Filename = dirname + "/" + originalFilename;
        File file = new File(Filename);
        uploadfile.transferTo(file);
        return "Success";
    }
}
