@Reservasi
Feature: Reservasi Sub Page

  Scenario: Verify 'X' button is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    Then pop up 'Reservasi' sub page
    Then show X button

  Scenario: Verify title 'Reservasi' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show title 'Reservasi' title

  Scenario: Verify text 'Let's thrive with "<namaGuru>"' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Let's thrive with "Aisyah"'

  Scenario: Verify text 'Perkenalan diri anda' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Perkenalan diri'

  Scenario: Verify 'Perkenalan Diri' field is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'Perkenalan Diri' field

  Scenario: Verify text 'Format Kursus' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Format Kursus'

  Scenario: Verify 'Format Kursus' button is display
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'Format Kursus' button

  Scenario: Verify 'Format Kursus' button can be click
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'Format Kursus' button
    And Student click 'Format Kursus' button
    Then 'Format Kursus' button can be click

  Scenario: Verify text 'Tanggal Kursus Pertama' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Tanggal Kursus Pertama'

  Scenario: Verify select 'Pilih Jam' button is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'Pilih Jam' button

  Scenario: Verify text 'Informasi Kontak' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Informasi Kontak'

  Scenario: Verify text 'Kontak yang anda berikan hanya akan dibagikan ke guru terkait' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Kontak yang anda berikan hanya akan dibagikan ke guru terkait'

  Scenario: Verify 'Alamat' field is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'Alamat' field

  Scenario: Verify 'No. Hp' field is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'No Hp' field

  Scenario: Verify 'Lanjutkan Pembayaran' button is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'Lanjutkan Pembayaran' button

  /Scenario: Verify 'Lanjutkan Pembayaran' button is enable
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show 'Lanjutkan Pembayaran' button
    And Student click 'Lanjutkan Pembayaran' button
    Then 'Lanjutkan Pembayaran' button can be click

  Scenario: Verify 'Profil Picture' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show picture 'Profil Picture'

  Scenario: Verify '"<namaGuru>"' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text Nama Guru "Aisyah"

  Scenario: Verify text 'Ulasan' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Ulasan'

  Scenario: Verify text 'Ulasan' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text 'Tarif Belajar/Jam'

  Scenario: Verify text '"<Tarif>"' is displayed
    Given Student at 'Detail Page Teacher murid POV'
    When Student click 'Reservasi' button
    And pop up 'Reservasi' sub page
    Then show text Tarif "19999"