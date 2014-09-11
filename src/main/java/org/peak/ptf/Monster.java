/**
 * 
 */
package org.peak.ptf;

import java.util.Date;

import javax.persistence.*;

/**
 * @author jackho
 *
 */
@Entity
@Table(name = "monster")
public class Monster {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String ability;
	@Column
	private Date born;
	@Column 
	private double height;
	@Column
	private double weight;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the ability
	 */
	public String getAbility() {
		return ability;
	}
	/**
	 * @param ability the ability to set
	 */
	public void setAbility(String ability) {
		this.ability = ability;
	}
	/**
	 * @return the born
	 */
	public Date getBorn() {
		return born;
	}
	/**
	 * @param born the born to set
	 */
	public void setBorn(Date born) {
		this.born = born;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
