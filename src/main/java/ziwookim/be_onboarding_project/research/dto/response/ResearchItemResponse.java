package ziwookim.be_onboarding_project.research.dto.response;

import lombok.*;
import ziwookim.be_onboarding_project.research.model.ResearchItemVo;

import java.util.List;

@Getter
@Setter
@Builder(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ResearchItemResponse {
    private Long id;
    private String name;
    private String description;
    private Integer itemType;
    private String  itemTypeName;
    private Boolean isRequired;
    private List<ResearchItemChoiceResponse> researchItemChoiceResponseList;

    public static ResearchItemResponse of(ResearchItemVo vo) {
        return ResearchItemResponse.builder()
                .id(vo.getId())
                .name(vo.getName())
                .description(vo.getDescription())
                .itemType(vo.getItemType())
                .itemTypeName(vo.getItemTypeName())
                .isRequired(vo.getIsRequired())
                .researchItemChoiceResponseList(vo.getResearchItemChoiceVoList().stream().map(ResearchItemChoiceResponse::of).toList())
                .build();
    }

}