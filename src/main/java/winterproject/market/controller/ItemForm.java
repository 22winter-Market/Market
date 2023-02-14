package winterproject.market.controller;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ItemForm {
    @NotEmpty(message = "사용자 정보가 없습니다.")
    private String memberId;

    @NotEmpty(message = "제목이 없습니다.")
    private String title;

    @NotEmpty(message = "내용이 없습니다.")
    private String contents;

    @NotEmpty(message = "가격이 없습니다.")
    private int price;

    private List<MultipartFile> imageFiles;

    @NotEmpty
    private String tradeMethod;

    private String tradePlace;
}
