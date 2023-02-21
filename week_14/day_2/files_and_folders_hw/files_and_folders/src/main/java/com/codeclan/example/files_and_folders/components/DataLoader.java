package com.codeclan.example.files_and_folders.components;

import com.apple.eawt.Application;
import com.codeclan.example.files_and_folders.FilesAndFoldersApplication;
import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.Person;
import com.codeclan.example.files_and_folders.repositories.FileRepository;
import com.codeclan.example.files_and_folders.repositories.FolderRepository;
import com.codeclan.example.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepo;
    @Autowired
    private FolderRepository folderRepo;
    @Autowired
    private PersonRepository personRepo;
    @Override
    public void run(ApplicationArguments args) throws Exception{

        Person jane = new Person("Jane");
        personRepo.save(jane);

        Person dave = new Person("Dave");
        personRepo.save(dave);

        Person tim = new Person("Tim");
        personRepo.save(tim);

        Folder colours = new Folder("Colours", jane);
        folderRepo.save(colours);

        Folder shapes = new Folder("Shapes", jane);
        folderRepo.save(shapes);

        Folder materials = new Folder("Materials", dave);
        folderRepo.save(materials);

        File red = new File("Red", "rb", 5, colours);
        fileRepo.save(red);

        File yellow = new File("Yellow", "java", 8, colours);
        fileRepo.save(yellow);

        File green = new File("Green", "txt", 6, colours);
        fileRepo.save(green);

        File square = new File("Square", "java", 4, shapes);
        fileRepo.save(square);

        File circle = new File("Circle", "ruby", 1, shapes);
        fileRepo.save(circle);

        File triangle = new File("Triangle", "txt", 3, shapes);
        fileRepo.save(triangle);

        File wood = new File("Wood", "py", 2, materials);
        fileRepo.save(wood);

        File iron = new File("Iron", "py", 9, materials);
        fileRepo.save(iron);
    }
}
