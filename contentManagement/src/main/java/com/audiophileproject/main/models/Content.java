package com.audiophileproject.main.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contents")
public class Content {
	@Id
	@SequenceGenerator(
			name = "content_id_sequence",
			sequenceName = "content_id_sequence"
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "content_id_sequence"
	)
	private Long id;
	@NotNull
	private String title;
	@NotNull
	private String url;
	private String type;
	private Long length;
	@Lob
	private String description;
	@NotNull
	private Date pubDate;
	@ElementCollection
	private List<String> tags;
	@Column(nullable = false)
	private String userId;
}
