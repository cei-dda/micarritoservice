package uy.edu.cei.micarritoservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import uy.edu.cei.micarritoservice.entities.Item;
import uy.edu.cei.micarritoservice.mapper.ItemMapper;

@Service
public class ItemService {

	private ItemMapper itemMapper;

	public ItemService(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}

	public List<Item> fetchAll() {
		return this.itemMapper.fetchAll();
	}
	
	public Item fetch(Long id) {
		return this.itemMapper.fetchItemById(id);
	}
	
	public void save(Item item) throws Exception {
		if (item.getId() != null) {
			throw new Exception("id distino de null");
		}
		this.itemMapper.save(item);
	}
	
	public void update(Item item) {
		this.itemMapper.update(item);
	}
}
