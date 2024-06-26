﻿using Demo.DAL.Models;
using System.ComponentModel.DataAnnotations;
using System;
using Microsoft.AspNetCore.Http;

namespace Demo.PL.ViewModels
{
    public class EmployeeViewModel
    {

        public int Id { get; set; }
        [Required(ErrorMessage = "Name is required")]
        [MaxLength(50, ErrorMessage = "Max lenght is 50")]
        [MinLength(3, ErrorMessage = "Min lenght is 3")]
        public string Name { get; set; }

        [Range(22, 30)]
        public int? Age { get; set; }
        //[RegularExpression(@"^[0-9]{1,3}[a-zA-Z]{5,10}-[a-zA-Z}{5,10}=[a-zA-Z]{5,10}$", ErrorMessage = "Address must be like 123-street-city-country")]
        public string Address { get; set; }
        
        public int Salary { get; set; }
        public bool IsActive { get; set; }
        [EmailAddress]
        public string EmailAddress { get; set; }
        [Phone]
        public string Phone { get; set; }
        public DateTime HireDate { get; set; }
        public IFormFile Image { get; set; }
        public string ImageName { get; set; }   


        public Department Department { get; set; }  // navigation property of [1]

        public int? DepartmentId { get; set; } //ForgeinKey 
    }
}
