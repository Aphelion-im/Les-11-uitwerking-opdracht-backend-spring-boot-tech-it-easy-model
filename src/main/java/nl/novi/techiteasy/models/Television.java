package nl.novi.techiteasy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity(name = "Television")
@Table(name = "Televisions") // In pgAdmin: televisions. data.sql reageert hier ook op.
public class Television {

    @Id
    // GeneratedValue betekent dat je deze waarde niet zelf hoeft in te vullen, dit doet Spring Boot voor jou bij het opslaan in de database.
    // Zie meer annotaties voor de velden: https://github.com/Aphelion-im/Les-11-uitwerking-opdracht-studenten/blob/main/src/main/java/nl/novi/les11studenten/models/Student.java
    @GeneratedValue
    private Long id;

    private String type;
    private String brand;
    private String name;
    private Double price; // Waarom  allemaal wrapper classes?!
    private AvailableSize availableSize; // ENUM
    private Double refreshRate;
    private String screenType;
    private ScreenQuality screenQuality; // ENUM
    private Boolean smartTv;
    private Boolean wifi;
    private Boolean voiceControl;
    private Boolean hdr;
    private Boolean bluetooth;
    private Boolean ambiLight;
    private LocalDate originalStock; // yyyy-mm-dd
    private LocalDate sold; // yyyy-mm-dd of null


// Constructors
// Constructors hoeven niet per se aangemaakt te worden. Java maakt automatisch een default constructor (achter de schermen).
// Let er op dat wanneer je een eigen constructor maakt, bijvoorbeeld een constructor met alle gevraagde variabelen,
// dan verdwijnt de automatische default constructor. Je moet dan zelf ook een default constructor maken.
// Je maakt dus nooit 1 constructor. Het is 0 of 2, 3, 4, etc.


//    // Een default no args constructor
//    public Television() {}
//
//    // Een constructor met alle gevraagde variable
//    public Television(
//            Long id,
//            String type,
//            String brand,
//            String name,
//            Double price,
//            Double availableSize,
//            Double refreshRate,
//            String screenType,
//            String screenQuality,
//            Boolean smartTv,
//            Boolean wifi,
//            Boolean voiceControl,
//            Boolean hdr,
//            Boolean bluetooth,
//            Boolean ambiLight,
//            Integer originalStock,
//            Integer sold ) {
//        this.id = id;
//        this.type = type;
//        this.brand = brand;
//        this.name = name;
//        this.price = price;
//        this.availableSize = availableSize;
//        this.refreshRate = refreshRate;
//        this.screenType = screenType;
//        this.screenQuality = screenQuality;
//        this.smartTv = smartTv;
//        this.wifi = wifi;
//        this.voiceControl = voiceControl;
//        this.hdr = hdr;
//        this.bluetooth = bluetooth;
//        this.ambiLight = ambiLight;
//        this.originalStock = originalStock;
//        this.sold = sold;
//    }


    public Television() {
    }

    // Deze constructor nooit gebruikt = grijs
    public Television(Long id, String type, String brand, String name, Double price, AvailableSize availableSize, Double refreshRate, String screenType, ScreenQuality screenQuality, Boolean smartTv, Boolean wifi, Boolean voiceControl, Boolean hdr, Boolean bluetooth, Boolean ambiLight, LocalDate originalStock, LocalDate sold) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.availableSize = availableSize;
        this.refreshRate = refreshRate;
        this.screenType = screenType;
        this.screenQuality = screenQuality;
        this.smartTv = smartTv;
        this.wifi = wifi;
        this.voiceControl = voiceControl;
        this.hdr = hdr;
        this.bluetooth = bluetooth;
        this.ambiLight = ambiLight;
        this.originalStock = originalStock;
        this.sold = sold;
    }

    // Eerst alle Getters, dan alle Setters. IntelliJ plaatst los get/set/get/set/etc.
    // Eerst alle Getters, dan alle Setters. Of Lombok: @Getter en/of @Setter
    // Getters
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public AvailableSize getAvailableSize() {
        return availableSize;
    }

    public Double getRefreshRate() {
        return refreshRate;
    }

    public String getScreenType() {
        return screenType;
    }

    public ScreenQuality getScreenQuality() {
        return screenQuality;
    }

    public Boolean getSmartTv() {
        return smartTv;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public Boolean getVoiceControl() {
        return voiceControl;
    }

    public Boolean getHdr() {
        return hdr;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public Boolean getAmbiLight() {
        return ambiLight;
    }

    public LocalDate getOriginalStock() {
        return originalStock;
    }

    public LocalDate getSold() {
        return sold;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAvailableSize(AvailableSize availableSize) {
        this.availableSize = availableSize;
    }

    public void setRefreshRate(Double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public void setScreenQuality(ScreenQuality screenQuality) {
        this.screenQuality = screenQuality;
    }

    public void setSmartTv(Boolean smartTv) {
        this.smartTv = smartTv;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public void setVoiceControl(Boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public void setHdr(Boolean hdr) {
        this.hdr = hdr;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setAmbiLight(Boolean ambiLight) {
        this.ambiLight = ambiLight;
    }

    public void setOriginalStock(LocalDate originalStock) {
        this.originalStock = originalStock;
    }

    public void setSold(LocalDate sold) {
        this.sold = sold;
    }
}







