package ziwookim.be_onboarding_project.research.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import ziwookim.be_onboarding_project.research.dto.request.AddResearchRequestVo;
import ziwookim.be_onboarding_project.research.dto.request.EditResearchRequestVo;
import ziwookim.be_onboarding_project.research.dto.request.SubmitResearchRequestVo;
import ziwookim.be_onboarding_project.research.dto.response.ResearchAnswerResponse;
import ziwookim.be_onboarding_project.research.model.ResearchAnswerResearchVo;
import ziwookim.be_onboarding_project.research.model.ResearchVo;

import java.util.List;

public interface ResearchService {

    ResearchVo addResearch(AddResearchRequestVo requestVo);
    ResearchVo editResearch(EditResearchRequestVo requestVo);
    ResearchAnswerResearchVo submitResearchAnswer(SubmitResearchRequestVo requestVo) throws JsonProcessingException;
    ResearchAnswerResponse getResearchAnswer(Long researchAnswerId);
}
