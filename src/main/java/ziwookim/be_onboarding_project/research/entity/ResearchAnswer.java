package ziwookim.be_onboarding_project.research.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "RESEARCHANSWER")
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "researchId", "data"})
@EntityListeners(AuditingEntityListener.class)
public class ResearchAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long researchId;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String data;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    public static ResearchAnswer create(Long researchId, String data) {
        ResearchAnswer entity = new ResearchAnswer();
        entity.setResearchId(researchId);
        entity.setData(data);
        return entity;
    }
}
