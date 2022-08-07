package com.techelevator.controller;

import com.techelevator.dao.CatCardDao;
import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardNotFoundException;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Random;

<<<<<<< HEAD

@RequestMapping("/api/cards")
=======
>>>>>>> a4927c35f4f2d11b2f9adedee07a675dabd6e645
@RestController
@RequestMapping("api/cards/")

public class CatController  {
@Autowired
    private CatCardDao catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDao catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<CatCard> list() {

        return catCardDao.list();
    }

<<<<<<< HEAD
    @GetMapping(path = "/{id}")
    public CatCard get(@Valid @PathVariable long id) throws CatCardNotFoundException {
        return catCardDao.get(id);
    }

    @GetMapping(path = "/random")
    public CatCard random() {
        CatCard catCardRandom = new CatCard();
        CatFact catFact = catFactService.getFact();
        CatPic catPic = catPicService.getPic();
        catCardRandom.setCatFact(catFact.getText());
        catCardRandom.setImgUrl(catPic.getFile());
        catCardRandom.setCaption("");
        return catCardRandom;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public boolean save(@RequestBody CatCard catCard) {
=======
    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public CatCard get(@PathVariable long id) throws CatCardNotFoundException {

        return catCardDao.get(id);
    }

    @RequestMapping(path ="random", method = RequestMethod.GET)
    public CatCard random() throws CatCardNotFoundException {
        CatCard catCard = new CatCard(
                catFactService.getFact().getText(),
                catPicService.getPic().getFile()
        );
        return catCard;
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public boolean create(@Valid @RequestBody CatCard catCard) {
>>>>>>> a4927c35f4f2d11b2f9adedee07a675dabd6e645
        return catCardDao.save(catCard);
    }






    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable int id) throws CatCardNotFoundException {

    }

}
