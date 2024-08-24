package upload.file.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    // Lấy dữ liệu file trong DTO --> save ảnh vào thư mục upload trong tomcat
    String uploadFileToLocal(MultipartFile multipartFile);

    // Lấy file từ thư mục upLoad(local) --> storage của firebase
    String uploadFileToFireBase(String localFilePath);
}
