package com.example.mis_pc_11.spc_app1.TheCity.Barangay

class BarangayModel

{
    var ivtitle:  String = ""
    var ivdistrict:  String = ""
    var ivcode:  String = ""
    var ivchairman: String = ""
    var ivcontact: String = ""


    constructor( ivtitle: String,  ivdistrict: String,  ivcode: String, ivchairman: String, ivcontact: String)
    {
        this.ivtitle = ivtitle
        this.ivdistrict = ivdistrict
        this.ivcode = ivcode
        this.ivchairman = ivchairman
        this.ivcontact = ivcontact
    }
}
