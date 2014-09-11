/**
 * 
 */
package org.peak.ptf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jackho
 *
 */
@Controller
public class LinkController {
	
	@Autowired 
	private MonsterRepository monsterRepository;
	
	@RequestMapping("/") 
	public ResponseEntity<List<Monster>> home() {
		Iterable<Monster> iterMonster = monsterRepository.findAll();
		List<Monster> monsterList = constructList(iterMonster);
		return new ResponseEntity<List<Monster>>(monsterList, HttpStatus.OK);
	}
	
	@RequestMapping("list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("list");
		Iterable<Monster> iterMonster = monsterRepository.findAll();
		List<Monster> monsterList = constructList(iterMonster);
		mav.addObject(monsterList);
		System.out.println(monsterList.get(0).getName());
		return mav;
		
	}
	private List<Monster> constructList(Iterable<Monster> iterMonster) {
		List<Monster> monsterList = new ArrayList<Monster>();
		for(Monster monster: iterMonster) {
			monsterList.add(monster);
		}
		return monsterList;
	}
	
}
