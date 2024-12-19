package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.example.demo.entity.enums.ProblemStatus;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="aaproblem")
public class Problem{
	

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AA_PATIENT_SEQ")
    @SequenceGenerator(sequenceName = "AA_PATIENT_SEQ", allocationSize = 1, name = "AA_PATIENT_SEQ")
	@Column(name = "problemid")
	private Long problemId;
	private String problemName;
    private String problemDetail;

    @Enumerated(EnumType.STRING)
	private ProblemStatus problemStatus;
    private int status;
    private Long patientid;
	private Long admissionid;

    @Temporal(TemporalType.TIMESTAMP)
    Date creationDate;
	
	@NotNull
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany(mappedBy = "problem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Receipe> receipes;
	public void setPatient(@NotNull Patient patient) {
		this.patient = patient;
	}

    public @NotNull Patient getPatient() {
		return patient;
	}

}
