package com.codeclan.example.files_and_folders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "extension")
    private String extension;
    @Column(name = "size")
    private int size;
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = true)
    @JsonIgnoreProperties({"files"})
    private Folder folder;

    public File(String name, String extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
