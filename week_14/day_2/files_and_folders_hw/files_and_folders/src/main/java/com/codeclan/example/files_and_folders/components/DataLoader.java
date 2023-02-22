package com.codeclan.example.files_and_folders.components;

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

        Folder folder1 = new Folder("Folder1", jane);
        folderRepo.save(folder1);

        Folder folder2 = new Folder("Folder2", jane);
        folderRepo.save(folder2);

        Folder folder3 = new Folder("Folder3", dave);
        folderRepo.save(folder3);

        File file1 = new File("File1", "rb", 5, folder1);
        fileRepo.save(file1);

        File file2 = new File("File2", "java", 8, folder1);
        fileRepo.save(file2);

        File file3 = new File("File3", "txt", 6, folder1);
        fileRepo.save(file3);

        File file4 = new File("File4", "java", 4, folder2);
        fileRepo.save(file4);

        File file5 = new File("File5", "ruby", 1, folder2);
        fileRepo.save(file5);

        File file6 = new File("File6", "txt", 3, folder2);
        fileRepo.save(file6);

        File file7 = new File("File7", "py", 2, folder3);
        fileRepo.save(file7);

        File file8 = new File("File8", "py", 9, folder3);
        fileRepo.save(file8);
    }
}
