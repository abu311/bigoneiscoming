package com.spring.test.step3;

import com.spring.test.step1.UserDto;
import com.spring.test.step2.User;
import com.spring.test.step2.UserRepository;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void saveEntitiesFromXml(String xml) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        List<UserDto> dtos = xmlMapper.readValue(xml, xmlMapper.getTypeFactory().constructCollectionType(List.class, UserDto.class));
        List<User> entities = dtos.stream().map(this::convertToEntity).collect(Collectors.toList());
        repository.saveAll(entities);
    }

    private User convertToEntity(UserDto dto) {
        User entity = new User();
        entity.setSomeField(dto.getSomeField());
        return entity;
    }
}