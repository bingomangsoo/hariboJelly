package my.jelly.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class jRate {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jIdx")
    private jInfo jInfoVO; //평가할 젤리 정보

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mAccount")
    private Member MemberVO; //평점 남긴 사용자 정보

    @Column(nullable = false)
    private int jStar; //젤리 평점

}
