package com.techelevator.model;

import javax.validation.constraints.NotEmpty;

<<<<<<< HEAD
public class CatCard {

	public Long catCardId;
	@NotEmpty
	public String catFact;
	@NotEmpty
	public String imgUrl;
	@NotEmpty
	public String caption;

	//no args Constructor
	public CatCard() {
	}

	//Constructor with two parameters
	public CatCard(String catFact, String imgUrl) {
		this.catFact = catFact;
		this.imgUrl = imgUrl;
	}

	public Long getCatCardId() {
		return catCardId;
	}
	public void setCatCardId(Long catCardId) {
		this.catCardId = catCardId;
	}
	
	public String getCatFact() {
		return catFact;
	}
	public void setCatFact(String catFact) {
		this.catFact = catFact;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
=======
public class CatCard
{
    
    public Long catCardId;
    @NotEmpty
    public String catFact;
    @NotEmpty
    public String imgUrl;
    
    public CatCard()
    {
    }
    
    public CatCard(String catFact, String imgUrl)
    {
        this.catFact = catFact;
        this.imgUrl = imgUrl;
    }
    
    @NotEmpty
    public String caption;
    
    public Long getCatCardId()
    {
        return catCardId;
    }
    
    public void setCatCardId(Long catCardId)
    {
        this.catCardId = catCardId;
    }
    
    public String getCatFact()
    {
        return catFact;
    }
    
    public void setCatFact(String catFact)
    {
        this.catFact = catFact;
    }
    
    public String getImgUrl()
    {
        return imgUrl;
    }
    
    public void setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }
    
    public String getCaption()
    {
        return caption;
    }
    
    public void setCaption(String caption)
    {
        this.caption = caption;
    }
    
>>>>>>> a4927c35f4f2d11b2f9adedee07a675dabd6e645
}
